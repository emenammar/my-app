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
            when{
                expression{
                    params.choix == 'build'
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
                    params.choix == 'test'
                }
            }
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
