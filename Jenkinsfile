pipeline {
  agent any
     tools { 
        maven 'apache-maven-3.8.4' 
        jdk 'JDK 11' 
    }
  
  environment { 
    NAME = 'reham farouk'
   }
  
  stages {   
     stage("build & SonarQube analysis") {
            steps {
              withSonarQubeEnv('My SonarQube Server') {
                bat 'mvn clean package sonar:sonar'
              }
            }
          }
          stage("Quality Gate") {
            steps {
              timeout(time: 1, unit: 'HOURS') {
                waitForQualityGate abortPipeline: true
              }
            }
            }
    stage('Test') {
      steps {
           junit 'Demo/target/surefire-reports/*.xml'
        }
    }
    
    stage('Code Coverage'){
      steps{
         step ([ $class: 'JacocoPublisher' ])
      }
    }
    
     stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    
    
  }
  
  post {
    always { 
        echo 'I will always say Hello again!'
    }
    success {
        echo 'I will say Hello only if job is success'
    }
    failure {
        echo 'I will say Hello only if job is failure'
    }
} 
  
  triggers {
     pollSCM('*/1 * * * *')
}

}
