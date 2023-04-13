def call(String repo = 'hipster'){
	sh "pkgrecv -s i386/repo -d /zdata/oirepo/${repo} '*'"
}
