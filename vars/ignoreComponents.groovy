def call(String[] ignore_list) {

	for(component in ignore_list){
		echo "Ignoring ${component}"
		writeFile file: 'components/components.ignore', text: "\n/^${component}\$/d"
	}
	
}
