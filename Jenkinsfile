pipeline 
{
    agent any

    stages 
    {
        stage('Getting Code from GitHub') 
        {
            steps 
            {
                git 'https://github.com/himanshud0190-cmd/Profile-02.git'
            }
        }
        stage('Executing Maven Project on Chrome Browser')
        {
            steps
            {
                bat 'mvn -Dmaven.test.failure.ignore=true clean test -DCliBrowser=Firefox'
            }
        }

    }

}