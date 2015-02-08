(ns test-static-handler.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defroutes app 
  (GET "/" [] "I do work.>")
  (PUT "/" [] "Do I work?")
  (route/not-found "<h1>Page not found</h1>"))
