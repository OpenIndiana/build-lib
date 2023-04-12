def call(Closure body) {
	ws('/var/lib/abuild/ws-oi-userland') {
		body()
	}
} 
