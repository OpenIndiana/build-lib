def call(String repo = 'hipster'){
	sh "pkgrecv -s i386/encumbered-repo -d /zdata/oirepo/${repo} '*'"
}
