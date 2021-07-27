pipeline {
    agent any
    parameters{
        choice (name: 'choix', choices: ['1', '2', '3'], description: 'choix du nom du Job ')
    }
    
    stages {
        stage("init") {
            steps {
                script {
                   gv = load "external-file.groovy" 
                }
            }
        }
        stage("build") {
            
            when{
                expression{
                    gv.build_orn 
                }
            }
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            when{
                expression{
                    params.choix == '2'
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            when{
                expression{
                    params.choix == '3'
                }
            }
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }   
}
