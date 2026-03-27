import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.pipelines.*   
import jetbrains.buildServer.configs.kotlin.buildSteps.script
version = "2025.11"

project {
    buildType(Build1)
    pipeline(Pipeline1)
}


object Build1 : BuildType({
    name = "Build1"
    vcs {
        root(DslContext.settingsRoot)
    }
    steps {
        script {
            id = "simpleRunner"
            scriptContent = "sleep 60"
        }
    }
})


object Pipeline1 : Pipeline({
    id("Pipeline1")
    name = "Pipeline1"

    repositories {
     repository(DslContext.settingsRoot)
    }
    dependencies {
        snapshot(Build1) {
            reuseBuilds = ReuseBuilds.NO
        }
    }

    job {
        id = "Job1"
        name = "Job5"
       
    }

})
