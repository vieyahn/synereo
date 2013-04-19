package com.ati.iaservices.recipes

import java.io.File
import com.protegra_ati.agentservices.core.schema.Profile
import scala.util.Random
import com.protegra_ati.agentservices.store.util.LogConfiguration._


class LauncherPluginUtil {

}

object LauncherPluginUtil {
  def configFileExists(filePath: String) {
    val f = new File(filePath)
    if (!f.exists()) {
      val errorMessage = "Missing config file for : " + filePath
      logger.error(errorMessage)
      throw new Exception(errorMessage)
    }
  }

  def createRandomProfile() = {
    val profile = new Profile()
    profile.setFirstName(createRandomWord(5))
    profile.setLastName(createRandomWord(8))
    profile.setCity("Winnipeg")
    profile.setRegion("MB")
    profile.setCountry("Canada")
    profile.setEmailAddress(createRandomWord(6) + "@" + createRandomWord(6) + ".com")
    profile
  }

  def createRandomWord(length: Int): String = {
    def safeChar() = {
      val res = (Random.nextInt('z' - 'a') + 'a').toChar
      res
    }

    List.fill(length)(safeChar()).mkString
  }
}
