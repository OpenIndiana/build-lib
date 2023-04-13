def call(String repo = 'hipster'){
	ws('/var/lib/abuild/ws-oi-userland') {
		sh "pkgrecv -s i386/repo -d /zdata/oirepo/${repo} '*'"
	}
}
