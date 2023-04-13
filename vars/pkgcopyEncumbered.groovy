def call(String repo = 'hipster'){
	ws('/var/lib/abuild/ws-oi-userland') {
		sh "pkgrepo -s i386/encumbered-repo remove '*'"
		sh "pkgrecv -s i386/encumbered-repo -d /zdata/oirepo/${repo} '*'"
	}
}
