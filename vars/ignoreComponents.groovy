def call(String[] ignore_list) {
	String ingore_content = '# generated by jenkins';
	for(component in ignore_list){
		ignore_content += "\n/^${component}\$/d"
	}
	writeFile file: 'components/components.ignore', text: ignore_content
}