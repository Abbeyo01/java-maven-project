def builApp() {
    echo 'building the application...'
} 

def testApp() {
    echo 'testing the applcation...'
    }
} 

def deployApp() {
    echo 'deploying the application'
    echo "deploying version ${params.VERSION}"
} 

return this
