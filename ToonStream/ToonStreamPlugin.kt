package com.toonstream.plugin

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class ToonstreamPlugin: Plugin() {
    override fun load() {
        registerMainAPI(ToonstreamProvider())
    }
}
