def call(ignore_list) {
	for(component in ignore_list){
		echo "Ignoring ${component}"
		writeFile file: 'components/encumbered/components.ignore', text: "\n/^${component}\$/d"
	}

}
