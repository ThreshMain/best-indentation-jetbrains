package com.github.threshmain.bestindentationjetbrains.services

import com.intellij.openapi.project.Project
import com.github.threshmain.bestindentationjetbrains.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
