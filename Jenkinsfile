
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
	 }
}
