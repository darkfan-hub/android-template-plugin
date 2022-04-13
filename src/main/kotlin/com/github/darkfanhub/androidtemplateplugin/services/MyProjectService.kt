package com.github.darkfanhub.androidtemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.darkfanhub.androidtemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
