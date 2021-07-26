pipeline {
    agent any
    parameters{
        string (name: 'choix', defaultValue:' ', description: 'choix du nom du Job ')
    }
    
    stages {
        
        
          stage("init") {
            steps {
                script {
                   gv = load "external-file.groovy" 
                }
            }
        }

        
        stage('Build') {
            when{
                 expression{
                     
               (  gv.build_fct (params.choix)  == true )
                 }
            }
            steps {
                echo 'building the app ... '
            }
        }
        
        
       stage('test') {
           when{
                expression{
               ( ( gv.test_fct () ) == true )
                }
            }
            steps {
                echo 'testing the app ...'
            }
       }
       stage('deploy') {
            when{
                expression{
               ( ( gv.deploy_fct () ) == true )
                }
            }
            steps {
                echo 'deploying the app ...'
            }
        }
    }
}

