(ns test-static-handler.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

;; Can't add routes not found
(defroutes app 
  (GET "/handler" [] "I'm a GET. I do work.")
  (POST "/handler" [] "I'm a POST. Do I work?"))
