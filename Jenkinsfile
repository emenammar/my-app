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
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }   
}
