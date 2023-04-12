def call(String publisher = 'openindiana.org', Closure body) {
	withEnv(['PUBLISHER=${publisher}', 'GOCACHE=/tmp/.cache/go-build', 'USERLAND_ARCHIVES=/var/tmp/userland-archives/', 'CRYPTOGRAPHY_ALLOW_OPENSSL_102=true', 'BASS_O_MATIC_MODE=incremental', 'GNUMAKEFLAGS=--no-print-directory']) {
    	body()
	}
} 
