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
                    params.choix == '1'
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
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }   
}
