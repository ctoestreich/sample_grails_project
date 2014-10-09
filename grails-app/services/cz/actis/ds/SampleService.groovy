package cz.actis.ds

import cz.actis.java.ds.api.MessageDownloader
import cz.actis.java.ds.common.DSSettings
import cz.actis.java.ds.test.TestAuth
import grails.transaction.Transactional

@Transactional
class SampleService {
    def serviceMethod() {
        DSSettings dsSettings = TestAuth.setDsSettings()
        MessageDownloader downloader = new MessageDownloader(dsSettings)
        return downloader.testConnection()
    }
}
