package io.github.lightbulb.view;

import java.net.URI;
import java.util.Date;
import java.util.UUID;
import org.springframework.lang.NonNull;

public interface FlatKeyword {

  @NonNull
  UUID getId();

  @NonNull
  Date getCreated();

  @NonNull
  Date getUpdated();

  @NonNull
  URI getHref();
}
