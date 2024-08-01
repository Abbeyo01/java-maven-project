pipeline {
    agent any
    tools {
       maven 'maven-3.9'
    }
    //stages {
        //stage("init") {
            //steps {
                //script {
                    //gv = load "script.groovy"
                //}
            //}
        //}
        stage("build jar") {
            steps {
                script {
                    echo "building tje application..."
                    sh 'mvn package'
                    //gv.buildJar()
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    echo "building the image..."
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                    sh 'docker build -t abbeyton/demo-app:jma-2.0 .'
                    sh "echo $PASS | docker login -u $USER --password-stdin"
                    sh 'docker push nanajanashia/demo-app:jma-2.0'
                    //gv.buildImage()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "deploying deploying the application"
                    //gv.deployApp()
                }
            }
        }
    }   
}
