def call() {
	sh 'pfexec pkg refresh --full'
	sh 'pfexec pkg install -v pkg:/package/pkg > /tmp/pkg-update.out.$$ || grep "No updates necessary for this image." /tmp/pkg-update.out.$$ > /dev/null'
                                                                                                                                                                                                               
	sh '(pfexec pkg update -v --deny-new-be > /tmp/pkg-update.out.$$ || grep "No updates available for this image." /tmp/pkg-update.out.$$ > /dev/null) || ((pfexec pkg update -v > /tmp/pkg-update.out.$$ || grep "No updates available for this image." /tmp/pkg-update.out.$$ > /dev/null) && pfexec shutdown -i6 -g30 -y)'
                                                                                                                                                                                                               
	sh 'cat /tmp/pkg-update.out.$$'
	sh 'rm /tmp/pkg-update.out.$$'
 
}