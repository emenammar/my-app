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
               ( ( gv.build_fct () ) == true )
            }
            steps {
                echo 'building the app ... '
            }
        }
        
        
       stage('test') {
           when{
               ( ( gv.test_fct () ) == true )
            }
            steps {
                echo 'testing the app ...'
            }
       }
       stage('deploy') {
            when{
               ( ( gv.deploy_fct () ) == true )
            }
            steps {
                echo 'deploying the app ...'
            }
        }
    }
}

