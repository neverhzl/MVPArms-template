package com.github.neverhzl.mvparmstemplate.services

import com.intellij.openapi.project.Project
import com.github.neverhzl.mvparmstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
