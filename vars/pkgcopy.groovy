def call(String repo = 'hipster'){
	ws('/var/lib/abuild/ws-oi-userland') {
		sh "pkgrepo -s i386/repo remove '*'"
		sh "pkgrecv -s i386/repo -d /zdata/oirepo/${repo} '*'"
	}
}
