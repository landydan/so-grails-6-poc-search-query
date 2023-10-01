package pl.xpu.poc

import pl.xpu.SavedSearch

class SearchingController {

    def index() {
        render("temp")
    }

    def test(String search) {
        log.info("search: ${search}")
        render("testing ${search}")
    }

    def something() {
        Long searchId = params.id as Long
        // below is the line that needs to be present
        SavedSearch search = SavedSearch.read(searchId)
        render("placeholder")
    }


}