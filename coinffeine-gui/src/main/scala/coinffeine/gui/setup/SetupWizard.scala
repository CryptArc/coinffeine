package coinffeine.gui.setup

import coinffeine.gui.wizard.Wizard

/** Wizard to collect the initial configuration settings */
class SetupWizard(walletAddress: String) extends Wizard[SetupConfig](
  wizardTitle = "Initial setup",
  steps = Seq(
    new PasswordStepPane,
    new OkPayCredentialsStepPane,
    new OkPaySeedTokenRetrievalPane,
    new TopUpStepPane(walletAddress)
  ),
  initialData = SetupConfig(password = None, okPayCredentials = None, okPayWalletAccess = None)
)
