#!/usr/bin/env groovy

def call() {
    sh(
	/usr/bin/curl -s -X POST https://api.telegram.org/bot5700617525:AAGXbkqZ2psOplICMFSWVhggYM2ySrNtgeQ/sendMessage -d chat_id=-678535988 -d text="your message"
    )
}

