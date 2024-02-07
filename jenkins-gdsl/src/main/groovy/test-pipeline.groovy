pipeline{
    agent any
    stages{
        stage ('Read File'){
            steps{
                script{
                    print ${WORKSPACE}
                    def props = readJSON file: 'jenkins-gdsl/src/main/groovy/org/example/properties.json'
                    print props['name']
                }
            }
        }
    }
}
