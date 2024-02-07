pipeline{
    agent any
    stages{
        stage ('Read File'){
            steps{
                script{
                    def props = readJSON file: '/jenkins-gdsl/src/main/groovy/org/example/properties.json'
                    print props['name']
                }
            }
        }
    }
}
