#!/usr/bin/env groovy

def sendTelegramMessage(projectName, chatId, botToken, gitBranch) {
  try {
    sh(
      script: """	#!/usr/bin/env bash
	curl -s -X POST https://api.telegram.org/bot[TOKENID]/sendMessage -d chat_id=[ID] -d text="your message"
	"""

    log("Pushed success")
  } catch(err) {
    logError("Push failed")
    throw err
  }
}

