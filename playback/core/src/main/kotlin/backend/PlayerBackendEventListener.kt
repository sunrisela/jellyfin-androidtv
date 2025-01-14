package org.jellyfin.playback.core.backend

import org.jellyfin.playback.core.model.PlayState

interface PlayerBackendEventListener {
	fun onPlayStateChange(state: PlayState)
	fun onVideoSizeChange(width: Int, height: Int)
}
