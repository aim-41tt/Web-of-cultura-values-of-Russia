package webAppTaskList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.scheduling.annotation.Async;
import java.util.concurrent.CompletableFuture;

@Controller
@RequestMapping("/")
public class Controllers {

    @Async
    @GetMapping("/")
    public CompletableFuture<String> home() {
        return CompletableFuture.completedFuture("index");
    }

    @Async
    @GetMapping("/historical-places")
    public CompletableFuture<String> showHistoricalPlaces() {
        return CompletableFuture.completedFuture("historical-places");
    }

    @Async
    @GetMapping("/cultural-events")
    public CompletableFuture<String> showCulturalEvents() {
        return CompletableFuture.completedFuture("cultural-events");
    }

    @Async
    @GetMapping("/museums-exhibitions")
    public CompletableFuture<String> showMuseumsExhibitions() {
        return CompletableFuture.completedFuture("museums-exhibitions");
    }

    @Async
    @GetMapping("/traditional-cuisine")
    public CompletableFuture<String> showTraditionalCuisine() {
        return CompletableFuture.completedFuture("traditional-cuisine");
    }

    @Async
    @GetMapping("/festivals-celebrations")
    public CompletableFuture<String> showFestivalsCelebrations() {
        return CompletableFuture.completedFuture("festivals-celebrations");
    }
}
