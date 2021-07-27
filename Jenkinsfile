pipeline {
    agent any
    parameters{
        string (name: 'choix', defaultValue:' ', description: 'choix du nom du Job ')
    }
    
    stages{
        
        stage('Build') {
            when{
                expression{
                     params.choix  == "build" 
                 }
            }
            steps {
                echo 'building the app ... '
            }
        }
        
        
       stage('test') {
            when{
              expression{
                params.choix == 'test'
               }
            }
           
            steps {
                script {
                echo 'testing the app ...'
                }
            }
       }
       stage('deploy') {
            when{
                expression{
               ( params.choix  == 'deploy' )
                }
            }
            steps {
                echo 'deploying the app ...'
            }
        }
    }
}

