(ns ^:figwheel-always test-static-handler.core
    (:require [ajax.core :refer [GET POST]]))

(enable-console-print!)

(defn callback [msg resp]
  (println msg)
  (println (str resp)))

(GET "/handler" {:handler (partial callback "GET/OK:")
                 :error-handler (partial callback "GET/ERROR:")})

(POST "/handler" {:handler (partial callback "POST/OK:")
                  :error-handler (partial callback "POST/ERROR:")})
