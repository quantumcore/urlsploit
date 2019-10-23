from core.url_main import *
import argparse
def main():
    AnimateIntro()
    parser = argparse.ArgumentParser(description="URLSploit.")
    parser.add_argument("--t", "-template", required=True,help="The template to use. Use --list-templates to view available templates.")
    args = parser.parse_args()
    
    template = args.t
    print(template)
main()