pipeline{
    agent any
    stages{
        stage ('Read File'){
            steps{
                script{
                    print "Currently in: " + pwd()
                    def props = readJSON file: '\\my-first-pipeline\\jenkins-gdsl\\src\\main\\groovy\\org\\example\\properties.json'
                    print props['name']
                }
            }
        }
    }
}
