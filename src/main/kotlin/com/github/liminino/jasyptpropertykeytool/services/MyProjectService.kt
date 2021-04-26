package com.github.liminino.jasyptpropertykeytool.services

import com.github.liminino.jasyptpropertykeytool.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
