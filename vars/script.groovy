#!/usr/bin/env groovy

def sendTelegramMessage(projectName, chatId, botToken, gitBranch) {
  try {
    sh(
      script: """#!/usr/bin/env bash
        curl --location --request POST 'https://api.telegram.org/bot${botToken}/sendMessage' \
        --header 'Content-Type: application/json' \
        --data-raw '{
            "chat_id": ${chatId},
            "parse_mode": "HTML",
            "text": "<b>Project</b> : ${projectName} <b>Branch</b>: ${gitBranch} <b>Build </b> : OK <b>Test suite</b> = Passed"
        }'
      """
    )
    log("Pushed success")
  } catch(err) {
    logError("Push failed")
    throw err
  }
}

