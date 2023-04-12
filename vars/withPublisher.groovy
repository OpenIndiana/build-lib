def call(String publisher = 'openindiana.org', String bass_o_matic_mode = 'incremental', Closure body) {
	withEnv(["PUBLISHER=${publisher}", 'GOCACHE=/tmp/.cache/go-build', 'USERLAND_ARCHIVES=/var/tmp/userland-archives/', 'CRYPTOGRAPHY_ALLOW_OPENSSL_102=true', "BASS_O_MATIC_MODE=${bass_o_matic_mode}", 'GNUMAKEFLAGS=--no-print-directory']) {
		ws('/var/lib/abuild/ws-oi-userland') {
    		body()
		}
	}
} 
