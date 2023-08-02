def call(run) {
    def lastSuccessfulBuild = run.getParent().getLastSuccessfulBuild()
    if (lastSuccessfulBuild) {
        return lastSuccessfulBuild.getEnvVars().get('DOCKERTAG_ID')
    } else {
        return null
    }
}

