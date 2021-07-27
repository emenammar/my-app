pipeline {
    agent any
    parameters{
        string (name: 'choix', defaultValue:' ', description: 'choix du nom du Job ')
    }
    
    stages {
        
        
          

        
        stage('Build') {
            when{
                 expression{
                     
               ((params.choix)  == 'build' )
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

