/*
 * Copyright 2015 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.java.gettingstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;

@SpringBootApplication

public class HelloworldApplication extends SpringBootServletInitializer {
//	private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
//    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloworldApplication.class);
	}

//    @GetMapping("/hello-world")
//    @CrossOrigin(origins = "http://localhost:8080/hello-world")
//    @ResponseBody
//    public Products sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
//    	Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
//    	
//    	Key taskKey = datastore.newKeyFactory().setKind(name).newKey(name);
//    	
//    	Entity task = Entity.newBuilder(taskKey)
//    			 .set(name, counter.incrementAndGet())
//    		        .set("description", "Buy milk")
//    		        .build();
//    	 datastore.put(task);
//    	 System.out.printf("Saved %s: %s%n", task.getKey().getName(), task.getString("description"));
//
// 	    //Retrieve entity
// 	    //Entity retrieved = datastore.get(taskKey);
//
// 	    //System.out.printf("Retrieved %s: %s%n", taskKey.getName(), retrieved.getString("description"));
//
//        return new Productss(counter.incrementAndGet(), String.format(template, name));
//    }

//  /**
//   * (Optional) App Engine health check endpoint mapping.
//   * @see <a href="https://cloud.google.com/appengine/docs/flexible/java/how-instances-are-managed#health_checking"></a>
//   * If your app does not handle health checks, a HTTP 404 response is interpreted
//   *     as a successful reply.
//   */
//  @RequestMapping("/_ah/health")
//  public String healthy() {
//    // Message body required though ignored
//    return "Still surviving.";
//  }

  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }
  
//  @Bean
//  public WebMvcConfigurer corsConfigurer() {
//      return new WebMvcConfigurerAdapter() {
//          @Override
//          public void addCorsMappings(CorsRegistry registry) {
//              registry.addMapping("/hello-world").allowedOrigins("http://localhost:8080");
//          }
//      };
//  }
  
 
}
