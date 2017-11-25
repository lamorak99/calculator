
pipeline {
     agent any
     stages {
          stage("Compile") {
               steps {
                    sh "./mvnw clean package"
               }
          }
          stage("Unit test") {
               steps {
                    sh "./mvnw test"
               }
          }
          stage('Integration Test'){
			steps{
				sh './mvnw verify'
			}
		  }
	 }
}
