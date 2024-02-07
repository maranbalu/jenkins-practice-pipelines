pipeline{
    agent any
    stage ('Read File'){
        def props = readJSON file: '/jenkins-gdsl/src/main/groovy/org/example/properties.json'
        print props['name']
    }
}
