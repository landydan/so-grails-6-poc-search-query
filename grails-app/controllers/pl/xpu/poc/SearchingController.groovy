package pl.xpu.poc


class SearchingController {

    def index() {

    }

    def test(String search) {
        log.info("search: ${search}")
        render("testing ${search}")
    }

}