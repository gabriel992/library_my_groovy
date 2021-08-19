import java.util.concurrent.TimeUnit
import groovy.json.*

def call(map){
    pipeline {
        agent any

        stages {
            stage('Build-1) {
                steps {
                    echo 'Building..'
                }
            }
            stage('Test') {
                steps {
                    echo 'Testing..'
                }
            }
            stage('Deploy') {
                steps {
                    echo 'Deploying....'
                }
            }
        }
        
    

    } 
}