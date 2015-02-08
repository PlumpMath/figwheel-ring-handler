(ns test-static-handler.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

;; Can't add routes not found
(defroutes app 
  (GET "/handler" [] "I do work.>")
  (PUT "/handler" [] "Do I work?"))
