def call(String repo = 'hipster'){
	ws('/var/lib/abuild/ws-oi-userland') {
		sh "pkgrecv -s i386/encumbered-repo -d /zdata/oirepo/${repo} '*'"
		sh "pkgrepo -s i386/encumbered-repo remove '*'"
	}
}
